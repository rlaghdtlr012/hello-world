package javabasic;

public class KimProfiles {
      int kimAge;
      String kimName;
      String kimMarriage;
      int kimChild;

   public static void main(String[] args) {
      KimProfiles saBu = new KimProfiles();
      saBu.kimAge=28;
      saBu.kimName="±è»çºÎ";
      saBu.kimMarriage="Y";
      saBu.kimChild=3;

      System.out.printf("±è»çºÎ ³ªÀÌ : %d\n", saBu.kimAge);
      System.out.printf("±è»çºÎ ÀÌ¸§ : %s\n", saBu.kimName);
      System.out.printf("±è»çºÎ °áÈ¥¿©ºÎ : %s\n", saBu.kimMarriage);
      System.out.printf("±è»çºÎ ³ªÀÌ : %d\n", saBu.kimChild);
   }

}