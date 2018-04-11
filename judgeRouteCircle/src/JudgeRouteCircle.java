
    public class JudgeRouteCircle {
        public boolean judgeCircle(String moves){
            int Up = 0 ;
            int Left = 0;
            for(char ch : moves.toCharArray()){
                if(ch == 'U'){
                    Up ++ ;
                }else if (ch == 'D'){
                    Up --;
                }else if(ch == 'L'){
                    Left ++;
                }else {
                    Left --;
                }
            }
            return (Up == 0) && (Left == 0);
        }
    }

