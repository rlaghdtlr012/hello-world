package javabasic;

public class KimProfiles {
      int kimAge;
      String kimName;
      String kimMarriage;
      int kimChild;

   public static void main(String[] args) {
      KimProfiles saBu = new KimProfiles();
      saBu.kimAge=28;
      saBu.kimName="����";
      saBu.kimMarriage="Y";
      saBu.kimChild=3;

      System.out.printf("���� ���� : %d\n", saBu.kimAge);
      System.out.printf("���� �̸� : %s\n", saBu.kimName);
      System.out.printf("���� ��ȥ���� : %s\n", saBu.kimMarriage);
      System.out.printf("���� ���� : %d\n", saBu.kimChild);
   }

}