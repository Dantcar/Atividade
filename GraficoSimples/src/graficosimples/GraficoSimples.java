/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficosimples;

import java.io.FileOutputStream; 
import java.io.IOException;
import java.io.OutputStream;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author deciodecarvalho
 */
public class GraficoSimples {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
		String msg ="";
		DefaultCategoryDataset dataset;
        dataset = new DefaultCategoryDataset();
		dataset.addValue(10.1, "Máximo", "Hora 1");
		dataset.addValue(20.1, "Máximo", "Hora 2");
		dataset.addValue(30.1, "Máximo", "Hora 3");
		dataset.addValue(40.1, "Máximo", "Hora 4");
		dataset.addValue(70.1, "Máximo", "Hora 5");
		
                //Criando o nosso Gráfico
		
		JFreeChart criaGrafico = ChartFactory.createLineChart("nome do grafico: Gráfico Simples",
		"Hora", "Valor", dataset, PlotOrientation.VERTICAL, true, true, false);
		
		try{
			System.out.println("Criando o Gráfico....");
                    try (OutputStream jpeg = new FileOutputStream("MeusGraficos\\GraficoSimples.jpeg") //salva no local do projeto
                    ) {
                        //ChartUtilities.writeChartAsPNG(png, criaGrafico, 500, 400);
                        //png.close(); //sempre fechar após abrir
                        ChartUtilities.writeChartAsJPEG(jpeg, criaGrafico, 600, 400);
                        jpeg.close();
                    }
		}catch(IOException io){
			msg = "Erro:" + io.getMessage();
		}
                if(msg.equals(""))
		System.out.println("Gráfico Criado!");
                else
                System.out.println(msg);
	}
    
}
