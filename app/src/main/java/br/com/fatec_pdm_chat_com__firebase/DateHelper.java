package br.com.fatec_pdm_chat_com__firebase;

import java.util.Date;
import java.text.SimpleDateFormat;

class DateHelper {

    private static SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");

    public static String format (Date date){
        return sdf.format(date);
    }
}
