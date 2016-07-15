package interfaceGrafica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFileChooser;

public class SalvarArquivo implements ActionListener{
	
	
	public SalvarArquivo() {
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		salvarArquivo();
	}
	
	public static void salvarArquivo(){
		System.out.println("Salvando arquivo");
		BufferedWriter writer = null;
		if(IDE.arquivoDeEntrada == null){
			JFileChooser chooser = new JFileChooser();
			chooser.setCurrentDirectory(new File(".\\arquivosTeste"));
		    int retorno = chooser.showSaveDialog(null);
		    if (retorno == JFileChooser.APPROVE_OPTION) {
		        try {
		        	IDE.arquivoDeEntrada = new File(chooser.getSelectedFile()+".txt");
		        	writer = new BufferedWriter(new FileWriter(IDE.arquivoDeEntrada));
		            writer.write(IDE.textEditor.getText().replace("\\n", "\n"));
		        } catch (Exception ex) {
		            ex.printStackTrace();
		        } finally {
					try {
						writer.close();
					} catch (IOException e1) {
						e1.printStackTrace();
					}
				}
		    }
		}else{
			try {
				writer = new BufferedWriter(new FileWriter(IDE.arquivoDeEntrada));
	            writer.write(IDE.textEditor.getText().replace("\\n","\n"));
			} catch (IOException e1) {
				e1.printStackTrace();
			} finally {
				try {
					writer.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
			
		}
	}

}
