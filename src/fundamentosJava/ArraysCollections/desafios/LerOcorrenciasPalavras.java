package fundamentosJava.ArraysCollections.desafios;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LerOcorrenciasPalavras {
	
   public static void main(String[] args) throws Exception {
	
	   String linha;
	   
	   Map<String, Integer> mapPalavras;
	   
	   mapPalavras = new HashMap<String, Integer>();
	   
	   
	   FileReader txtFile = new FileReader("C:\\Users\\Bradesco\\Desktop\\ProjetosTreinamento\\fundamentosJava\\src\\fundamentosJava\\ArraysCollections\\desafios\\diaBom.txt");
	   BufferedReader txtBuffer = new BufferedReader(txtFile);
	   
	   linha = txtBuffer.readLine();
	   
	   while(linha != null) {
		   String minusculo = linha.toLowerCase();
		   
		   Pattern p = Pattern.compile("(\\\\d+)|([a-z·ÈÌÛ˙Á„ıÙÍ]+)");
		   Matcher m = p.matcher(minusculo);
		   
		   	while(m.find()) {
		   		String token = m.group();
		   		Integer frequencia = mapPalavras.get(token);
		   		
		   			if(frequencia != null) {
		   				mapPalavras.put(token, frequencia+1);
		   			} else {
		   				mapPalavras.put(token, 1);
		   			}
		   	}
		   	
		   	linha = txtBuffer.readLine();
	   }
	   
	   txtBuffer.close();
	   
	   for(Map.Entry<String, Integer> entry: mapPalavras.entrySet()) {
		   System.out.println(entry.getKey() + "\tFrequencia=" + entry.getValue());
	   }
}

}
