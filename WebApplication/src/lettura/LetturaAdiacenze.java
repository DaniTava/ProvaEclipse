package lettura;

import elementi.Stato;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.ArrayList;

public class LetturaAdiacenze extends Lettura 
{

    public LetturaAdiacenze(String nomeFile) {
        super(nomeFile);
    }

    public ArrayList<Stato> lettura(ArrayList<Stato> stati) throws FileNotFoundException, IOException
    {
        ArrayList<Stato> adiacenze = new ArrayList<>();

        super.bufferedReaderInitialization();

        ArrayList<String> codici = new ArrayList<>();
        StringTokenizer st;
        String stringa = inputStream.readLine();

        while (stringa != null) 
        {
            st = new StringTokenizer(stringa, "\t\n");
            while (st.hasMoreElements()) 
            {
                int n = 0;
                int nTokens = st.countTokens();
                String codice = st.nextToken();

                while (n < nTokens - 1)
                {
                    String line = st.nextToken();
                    codici.add(line);
                    n++;
                }

                for (String c : codici) {
                    for (Stato d : stati) { 
                        if (d.controllo(c)) {
                            adiacenze.add(d);
                        }
                    }
                }

                for (Stato d : stati)
                {
                    if (d.controllo(codice))
                    {
                        d.addAdiacenze(adiacenze);
                    }
                }
                codici.clear();
                adiacenze.clear();
            }
            stringa = inputStream.readLine();
        }
        inputStream.close();
        return stati;
    }
}