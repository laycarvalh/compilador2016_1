package interfaceGrafica;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.Highlighter;
import javax.swing.text.Highlighter.HighlightPainter;

import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import excecoes.*;
//import sistema.ASTJung;
import compilador2016_1.*;
import grammarFiles.*;
import ast.*;
import Retornos.*;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JScrollBar;

public class IDE extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel panelSaida;
	public static JTextArea textEditor = new JTextArea();
	private static JTextArea textSaidaErro;
	public static File arquivoDeEntrada;
	private boolean showTree = true;
	JScrollPane scrollPane = new JScrollPane();
	JScrollPane scrollPaneE = new JScrollPane();
	JPanel panel = new JPanel();
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IDE frame = new IDE();
					frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public IDE() {
		setTitle("Compiladores 2015.2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu menuArquivo = new JMenu("Arquivo");
		menuBar.add(menuArquivo);
		
		JMenuItem jMenuItemAbrir = new JMenuItem("Abrir");
		jMenuItemAbrir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFileChooser chooser = new JFileChooser();
				chooser.setCurrentDirectory(new File(".\\arquivosTeste"));
		        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.txt", "txt", "text");
		        chooser.setFileFilter(filter);
		        chooser.showOpenDialog(null);
		        arquivoDeEntrada =  chooser.getSelectedFile();
				try {
					textEditor.setText("");
					BufferedReader bufferEntrada = new BufferedReader(new FileReader(arquivoDeEntrada));
					String linhaLida;
			        while((linhaLida = bufferEntrada.readLine()) != null)
			        {
			            textEditor.append(linhaLida+"\n");
			        }
			        bufferEntrada.close();
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		});
		menuArquivo.add(jMenuItemAbrir);
		
		JMenuItem jMenuItemSalvar = new JMenuItem("Salvar");
		jMenuItemSalvar.addActionListener(new SalvarArquivo());
		menuArquivo.add(jMenuItemSalvar);
		contentPane = new JPanel();
		getContentPane().setLayout(new GridLayout(4, 1));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{424, 0};
		gbl_contentPane.rowHeights = new int[]{230, 100, 20, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{1.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JButton btnCompilar = new JButton("Compilar");
		btnCompilar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textSaidaErro.setText("");
				textSaidaErro.setBackground(Color.green);
				showTree = true;
				ANTLRInputStream antlrInput = new ANTLRInputStream(textEditor.getText());
				TrabalhoFinal2016_1Lexer lexer = new TrabalhoFinal2016_1Lexer(antlrInput);
				//lexer.removeErrorListeners();
				//lexer.addErrorListener(ErroSintaticoListener.INSTANCE);
				CommonTokenStream tokens = new CommonTokenStream(lexer);
				TrabalhoFinal2016_1Parser parser = new TrabalhoFinal2016_1Parser(tokens);
				parser.removeErrorListeners();
				ErroSintaticoListener errorCollector = new ErroSintaticoListener();
				parser.addErrorListener(errorCollector);
				System.out.println(errorCollector.getErrors().size());
				
				//textEditor.append("COCOZINHO");
				 ParseTree	tree = parser.prog();
				
				GrammarVisitor loader = new GrammarVisitor();
				loader.visit(tree);
				try {
					new AnaliseSemantica(loader.getAST());
				} catch (Exception e) {
					// TODO Auto-generated catch block
					showTree = false;
					textSaidaErro.append("Erro "+" : "+e.getMessage()+"\n");
					//e.printStackTrace();
				}
				Highlighter highlighter = textEditor.getHighlighter();
				
			    HighlightPainter painter = 
			             new DefaultHighlighter.DefaultHighlightPainter(Color.pink);
			    highlighter.removeAllHighlights();
				if(errorCollector.getErrors().size() > 0){
					showTree = false;
					
					for (int i = 0 ;i < errorCollector.getErrors().size() ; i++) {
						SyntaxError e =  errorCollector.getErrors().get(i);
						highlighter = textEditor.getHighlighter();
				        // RecognitionExceptionUtil is my custom class discussed next.
						System.out.println("######################");
						/*textEditor =  underlineError(e.getRecognizer(),
								e.getOffendingToken(), e.getLine(),
								e.getCharPositionInLine(), textEditor);*/
						int start = e.getOffendingToken().getStartIndex();
						int stop = e.getOffendingToken().getStopIndex() + 1;
						String input = e.getOffendingToken().getTokenSource().getInputStream().toString();
						
					     int p0 = textEditor.getText().indexOf(input);
					     int p1 = p0 + input.length();
					      try {
							highlighter.addHighlight(start, stop, painter );
						} catch (BadLocationException e1) {
							// TODO Auto-generated catch block
							System.out.println("######################BADDDDD");
							e1.printStackTrace();
						}
						textSaidaErro.append("Erro "+(i+1)+": Linha "+e.getLine()+" : "+e.getMessage()+"\n");
						

						//contentPane.add(textError, BorderLayout.EAST );
						//contentPane.setBackground(Color.red);

						//panelSaida.add(textSaidaErro, BorderLayout.SOUTH );
						textSaidaErro.setBackground(Color.red);

						//.err.println("ENTROU");
						//textEditor.setHighlighter(highlighter);
						//textEditor.append("coco");
				    }
					//panel.add(scrollPaneE);
					//scrollPaneE.setViewportView(textError);
					
					
				}
//				if(showTree){
//					ASTJung astJung = new ASTJung(loader.getAST());
//					astJung.mostrarASTJung();
//				}
				
			}
		});
		
		textEditor.setTabSize(2);
		
		
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.insets = new Insets(0, 0, 5, 0);
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 0;
		contentPane.add(panel, gbc_panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		
		panel.add(scrollPane);
		
			
			scrollPane.setViewportView(textEditor);
		
		panelSaida = new JPanel();
		GridBagConstraints gbc_panelSaida = new GridBagConstraints();
		gbc_panelSaida.fill = GridBagConstraints.BOTH;
		gbc_panelSaida.insets = new Insets(0, 0, 5, 0);
		gbc_panelSaida.gridx = 0;
		gbc_panelSaida.gridy = 1;
		contentPane.add(panelSaida, gbc_panelSaida);
		panelSaida.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane_1 = new JScrollPane();
		panelSaida.add(scrollPane_1, BorderLayout.CENTER);
		
		textSaidaErro = new JTextArea();
		textSaidaErro.setEditable(false);
		scrollPane_1.setViewportView(textSaidaErro);
		GridBagConstraints gbc_btnCompilar = new GridBagConstraints();
		gbc_btnCompilar.anchor = GridBagConstraints.ABOVE_BASELINE;
		gbc_btnCompilar.gridx = 0;
		gbc_btnCompilar.gridy = 2;
		contentPane.add(btnCompilar, gbc_btnCompilar);
	}
	
	protected JTextArea underlineError(Recognizer<?, ?> recognizer,
			Token offendingToken, int line,
			int charPositionInLine, JTextArea text)  {
			CommonTokenStream tokens =
			(CommonTokenStream)recognizer.getInputStream();
			String input = tokens.getTokenSource().getInputStream().toString();
			String[] lines = input.split("\n");
			String errorLine = lines[line - 1];
			textSaidaErro.setText(errorLine);
			for (int i=0; i<charPositionInLine; i++) System.err.print(" ");
			int start = offendingToken.getStartIndex();
			int stop = offendingToken.getStopIndex();
			if ( start>=0 && stop>=0 ) {
			for (int i=start; i<=stop; i++) System.err.print("^");
			}
			Highlighter highlighter = text.getHighlighter();
		    HighlightPainter painter = 
		             new DefaultHighlighter.DefaultHighlightPainter(Color.pink);
		      int p0 = text.getText().indexOf(input);
		      int p1 = p0 + input.length();
		      try {
				highlighter.addHighlight(0, 3, painter );
			} catch (BadLocationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.err.println("ENTROU");
			text.setHighlighter(highlighter);
			text.append("coco");
			return text;
			
		}
}
