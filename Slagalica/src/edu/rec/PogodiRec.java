package edu.rec;

import java.util.ArrayList;
import java.util.Random;

public class PogodiRec {

	public static void main(String[] args) {
		/**
		 * Definicija liste i random f-je
		 

		 */
		ArrayList<String> listaReci=new ArrayList<String>();
        listaReci.add("Jabuka");
        listaReci.add("Hamburger");
        listaReci.add("Racun");
        listaReci.add("Voce");
       Random rn=new Random();
       int randWords=rn.nextInt(3);
       listaReci.get(randWords);
	   //F-ja za duzinu reci	
       int duzinaReci=0;
      String trenutnaRec=listaReci.get(randWords);
       if(duzinaReci==0){
    	  if(trenutnaRec!= null) {
    		 duzinaReci=trenutnaRec.length()+1;		 
    	 
    	        for (int i=0;i<duzinaReci;i++){
    		            int j=rn.nextInt(duzinaReci-i)+i;
    		            if(i!=j){
    		            	char pom=trenutnaRec.charAt(i);
    		            	pom=trenutnaRec.charAt(j);
    		            }
    	  }
    	  }
       }
    	//f-rotiraj
      int i=0,j=0,brojPokusaja=4;
    		if(i<0 || j<0 || i>=duzinaReci || j>=duzinaReci){
    			//pomeranje udesno
    			char pom=trenutnaRec.charAt(j);
    			
    			for(int k=j-1;k>=i;k--){
    				char kplus1=trenutnaRec.charAt(k+1);
    				char obicnok=trenutnaRec.charAt(k);
    				kplus1=obicnok;
    			}
    			pom=trenutnaRec.charAt(i);
    				
    			}else {
    				//pomeranje u levo
    				char pom=trenutnaRec.charAt(j);
    				
    				for(int k=j;k<i;k++){
        				char kplus1=trenutnaRec.charAt(k+1);
        				char obicnok=trenutnaRec.charAt(k);
        				obicnok= kplus1;
        				
        			}
    				pom=trenutnaRec.charAt(i);
    		}
    		brojPokusaja++;
	}

}
