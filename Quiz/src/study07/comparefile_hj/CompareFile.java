package study07.comparefile_hj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class CompareFile {

   public static void main(String[] args) throws IOException {


      /* 두 파일을 비교합니다. 서로 다른 파일이면 한 줄씩 교차로 복사하여 새로운 파일을 만드는 프로그램을 작성해 봅시다. 
       * 추가로 마지막은 현재 디렉토리에서 가장 큰 파일명과 크기를 출력합니다.

      - 첨부된 ‘노래모음’에 있는 파일 a~f들을 원하는 위치의 로컬디렉토리로 저장하면 됩니다.
      - 두 파일 이름을 입력받고, 두 파일 안의 내용이 같은지 비교합니다.
      - 같으면 ‘같습니다’ 출력
      - 다르면 두 파일의 내용을 한 줄씩 교차로 복사하여 새로운 파일에 저장합니다. 
       ** 파일 내용 길이가 다르면, 남은 내용만 출력하면 됩니다.
      - 마지막에는 현재 디렉토리에서 가장 큰 파일명과 크기를 출력합니다. 
      가장 큰 파일이 여러 개이면 아래 예시와 같이 파일 이름을 모두 출력해야 합니다.*/

      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      System.out.print("첫번째 파일 이름을 입력하세요 >> ");
      String f = br.readLine();
      BufferedReader fb = new BufferedReader(new FileReader(f+".txt"));
      
      System.out.print("두번째 파일이름을 입력하세요 >>");
      String s = br.readLine();
      BufferedReader sb = new BufferedReader(new FileReader(s+".txt"));
      String path = "C:\\Users\\rccar\\OneDrive\\바탕 화면\\김현진\\";
      //String path = "C:\\Users\\user\\Desktop\\course\\java\\work\\Quiz\\StringCompare\\";

      File file = new File(path + f + ".txt");
      File file2 = new File(path + s + ".txt");
      
      List<String> fLines = new ArrayList<>();
      List<String> sLines = new ArrayList<>();

      String fLine = "";
      String sLine = "";
      
      File fileAll = new File(path);
      File[] list = fileAll.listFiles();
      
      while((fLine = fb.readLine()) != null) {

         fLines.add(fLine);
      }

      while((sLine = sb.readLine()) != null) {

         sLines.add(sLine);

      }

      int count = 0;
      long max = 0;
      
      ArrayList<File>listName = new ArrayList<>();    
      

      if(fLines.size() == sLines.size()) {

         for(int i = 0; i < fLines.size(); i++) {

            for(int j = 0; j < sLines.size(); j++) {

               if(fLines.get(i).equals(sLines.get(j)) ) {

                  count++;
               } 

               if(count == fLines.size()) {

                  System.out.println("=> 같습니다.");
                  System.out.println("---------------------------");
                  
                  for(int l = 0; i < list.length; i++) {
                     
                     if(max <= list[i].length()) {
                        
                        max = list[i].length();
                       	
                        listName.add(list[i]);
                        
                     }
                     
                  }	
                  
                  for(File n : listName) {
                	  
                	  if(n.length() == max) {
                		  
                		  
                		  System.out.println("가장 큰 파일명 : [" + n.getName() + "], 크기: " + max +"byte");
                	  }
                	  
                	  
                  }
                                                      
                  
               }
            }
         }

      } else {

         System.out.println("=> 같지 않습니다. 파일 복사를 시작합니다.");
         System.out.println("---------------------------------------");
         System.out.print("새로운 파일 이름을 입력하세요 >>");

         String renewal = br.readLine();
         File nFile = new File(renewal + ".txt");
         BufferedReader fb2 = new BufferedReader(new FileReader(file));
         BufferedReader sb2 = new BufferedReader(new FileReader(file2));

         if(!nFile.exists()) {

            nFile.createNewFile();
            BufferedWriter bw = new BufferedWriter(new FileWriter(nFile,true));

            if(fLines.size() > sLines.size()) {

               for(int i = 0; i < fLines.size() ; i++) {

                  bw.write(fLines.get(i));
                  bw.newLine();

                  while(i < sLines.size()) {

                     bw.write(sLines.get(i));
                     bw.newLine();
                     break;
                  }

               }

               /* 둘다 동시에  읽히지 않나보다.. 한쪽먼저 돌고 돔..
                * while((fLine= fb2.readLine())!=null || (sLine=sb2.readLint()) !=null) {
                * 
                * bw.write(fLine); bw.newLine(); bw.write(sLine);
                * 
                * }
                */
            } else {

               for(int i = 0; i < sLines.size() ; i++) {

                  bw.write(sLines.get(i));
                  bw.newLine();

                  while(i < fLines.size()) {

                     bw.write(fLines.get(i));
                     bw.newLine();
                     break;
                  }

               }

               /*
                * while((sLine= fb2.readLine())!=null) {
                * 
                * bw.write(sLine); bw.newLine(); bw.write(fLine);
                * 
                * }
                */
            }

            System.out.println("복사 완료!");
            bw.flush();
            bw.close();
            System.out.println("--------------------------");
            
            
            System.out.println("가장 큰 파일 명 : [" + renewal + ".txt] "
                           + "/ 크기: "+ nFile.length()+ "byte");

         } else {

            System.out.println("중복된 파일명입니다.");

         }

      }
   }
}