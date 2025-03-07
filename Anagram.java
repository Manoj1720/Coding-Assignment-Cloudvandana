import java.util.*;
class Anagram{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.println("please enter word 1:");
        String word1=scan.nextLine();
        System.out.println("please enter word 2:");
        String word2=scan.nextLine();
        scan.close();

        System.out.println(Anagramchecker(word1,word2));
    }

    public static boolean Anagramchecker(String word1,String word2){

        word1=word1.replaceAll("\\s","").toLowerCase();
        word2=word2.replaceAll("\\s","").toLowerCase();

        if(word1.length()!= word2.length()) return false;
        
        HashMap<Character,Integer> hmap=new HashMap<>();

        for(Character c:word1.toCharArray()){
            hmap.put(c,hmap.getOrDefault(c,0)+1);
        }

        for(Character ch:word2.toCharArray()){
            if(!hmap.containsKey(ch)) return false;
            hmap.put(ch,hmap.get(ch)-1);
            if(hmap.get(ch)==0){
                hmap.remove(ch);
            }
        }
        return hmap.isEmpty();
    }
}