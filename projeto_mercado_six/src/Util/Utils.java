package Util;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.text.NumberFormat;

public class Utils {

   static NumberFormat numberFormat= new DecimalFormat("R$ #,##0.00", new DecimalFormatSymbols(new Locale("pt", "BR")));

   public static String doubleToString(Double value){
       return numberFormat.format(value);

   }



}
