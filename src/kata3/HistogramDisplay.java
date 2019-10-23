package kata3;

import java.awt.Container;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;

public class HistogramDisplay extends ApplicationFrame{

    public HistogramDisplay() {
        super("HISTOGRAMA");  //El super manda el titulo q viene en la ventana
        this.setContentPane(createPanel());
        this.pack();
    }
    public void execute(){
        setVisible(true);
    }
    private JPanel createPanel() {
        ChartPanel charpanePanel = new ChartPanel(createChar((DefaultCategoryDataset) createDataSet()));
        return charpanePanel;
    }

    private JFreeChart createChar(DefaultCategoryDataset dataset) {
        JFreeChart chart = ChartFactory.createBarChart("Histograma JFreeChart", "Dominios email", "Nº de emails", dataset, PlotOrientation.VERTICAL, false, false, rootPaneCheckingEnabled);
        return chart;
    }

    private CategoryDataset createDataSet() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(300, "", "ulpgc.es");
        dataset.addValue(150, "", "gmail");
        dataset.addValue(150, "", "dis.ulpgc.es");
        return dataset;
    }
    
}
