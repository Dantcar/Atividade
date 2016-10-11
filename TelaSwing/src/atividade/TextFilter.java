/**
* Utilitarios 
* Diversas funções utilitarias para Java
* Início: 22/09/2016
* 
*
*/


package atividade;

import java.io.File;
import javax.swing.filechooser.FileFilter;

/**
 * Arquivo filtro para utilizar no método accptAllFileFilterUsed de FileChooser
 * FileChooser.addChoosableFileFilter(new TextFilter());
 * @version 
 * @author Dantcar
 * @since 
 */
class TextFilter extends FileFilter {

    public TextFilter() {
    
    }
    
    @Override
    public boolean accept(File f) {
    if (f.isDirectory())
      return true;
    String s = f.getName();
    int i = s.lastIndexOf('.');
    
    //filtra para abrir somente arquivos txt
    if (i > 0 && i < s.length() - 1)
      if (s.substring(i + 1).toLowerCase().equals("txt")) 
        return true;
    
    //filtra para abrir somente arquivos pdf
    if (i > 0 && i < s.length() - 1)
      if (s.substring(i + 1).toLowerCase().equals("pdf"))
        return true;

    return false;
    }

    @Override
    public String getDescription() {
       return "Accepts txt e pdf files only.";
    }

}
