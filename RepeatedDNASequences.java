public class RepeatedDNASequences {
    public List<String> findRepeatedDnaSequences(String s) {
        HashSet<Integer> set= new HashSet<>();
        HashSet<Integer> repeat=new HashSet<>();
        List<String> list= new ArrayList<>();
        String sub;
        int subb;
        if(s.length()<=10) return list;
        for(int i=0;i<=s.length()-10;i++){
            sub=s.substring(i,i+10);
            subb=strtoint(sub);
            if(!set.contains(subb)){
                set.add(subb);
            }
            else
            repeat.add(subb);
        }
            for(Integer ss:repeat){
               list.add(inttostr(ss)); 
            }
             return list;
        }
        public int strtoint(String s){
            int re=0;
            for(int i=0;i<s.length();i++){
                re<<=2;
                switch(s.charAt(i)){
                    case 'A':
                        re |=0;
                        break;
                    case 'G':
                        re |=1;
                        break;
                    case 'C':
                        re |=2;
                        break;
                    case 'T':
                        re|=3;
                        break;
                }
            }
            return re;
        }
        public String inttostr(int re){
            String sre="";
            int tem,m;
            tem=re;
            for(int i=0;i<10;i++){
                m=tem%4;
                switch(m){
                    case 0:
                        sre="A"+sre;
                        break;
                    case 1:
                        sre="G"+sre;
                        break;
                    case 2:
                        sre="C"+sre;
                        break;
                    case 3:
                        sre="T"+sre;
                        break;
                }
                tem=tem/4;
            }
            return sre;
        }

    
}
