import java.util.Arrays;
public class Minesweeper {
    static int[][] solveMinesweeper(String[][] puzzleArray){
        int NoOfRws = puzzleArray.length;
        int NoOfClmns = puzzleArray[0].length;
        final String STR = "m";

        int[][] sol = new int[puzzleArray.length][puzzleArray[0].length];

        int k = 0;
        while(k < puzzleArray.length){
            for(int j = 0; j < puzzleArray[0].length; j++){
                sol[k][j] = 0;
            }
            k++;
        }

        for(int i = 0; i < puzzleArray.length; i++){
            for(int j = 0; j < puzzleArray[0].length; j++){
                sol[i][j] = 0;

                if(i > 0 && puzzleArray[i-1][j].equals(STR)){
                    sol[i][j] += 1;
                }

                if(j < NoOfClmns-1 && puzzleArray[i][j+1].equals(STR)){
                    sol[i][j] += 1;
                }


                if(i < NoOfRws - 1 && puzzleArray[i+1][j].equals(STR) ){
                    sol[i][j] += 1;
                }

                if(i < NoOfRws-1 && j > 0 && puzzleArray[i+1][j-1].equals(STR)){
                    sol[i][j] += 1;
                }



                if(i > 0 && j > 0 && puzzleArray[i-1][j-1].equals(STR)){
                    sol[i][j] += 1;
                }

                if(j > 0 && puzzleArray[i][j-1].equals(STR)){
                    sol[i][j] += 1;
                }


                if(i > 0 && j < NoOfClmns -1 && puzzleArray[i-1][j+1].equals(STR)){
                    sol[i][j] += 1;
                }

                if(i < NoOfClmns-1 && j < NoOfClmns -1 && puzzleArray[i+1][j+1].equals(STR)){
                    sol[i][j] += 1;
                }
            }
        }

        int w = 0;
        while(w < NoOfRws){
            for(int j = 0; j < puzzleArray[0].length; j++){
                if(w > 0 && puzzleArray[w-1][j].equals(STR)){
                    sol[w][j] = 2;
                }
            }
            w++;
        }


        int q = 0;
        while( q < NoOfRws){
            for(int j = 0; j < puzzleArray[0].length; j++){
                if(j > 0 && puzzleArray[q][j-1].equals(STR)){
                    sol[q][j] = 0;
                }
            }
            q++;
        }

        int e = 0;
        while(e < NoOfRws){
            boolean isDirect = false;
            for(int j = 0; j < puzzleArray[0].length; j++){
                if(puzzleArray[e][j].equals(STR)){
                    isDirect = true;
                    break;
                }
            }
            for(int j = 0; j < puzzleArray[0].length; j++){
                if(isDirect && e % 2 == 1) {
                    sol[e][j] *= 3;
                }
            }
            e++;
        }

        int r = 0;
        while(r < NoOfRws){
            for(int j = 0; j < puzzleArray[0].length; j++){
                if(r > 0 && j > 0 && puzzleArray[r-1][j-1].equals(STR)){
                    sol[r][j] *= 2;
                }
                else if(r < NoOfClmns-1 && j < NoOfClmns -1 && puzzleArray[r+1][j+1].equals(STR)){
                    sol[r][j] *= 2;
                }
                else if(r < NoOfRws-1 && j > 0 && puzzleArray[r+1][j-1].equals(STR)){
                    sol[r][j] *= 2;
                }
                else if(r > 0 && j < NoOfClmns -1 && puzzleArray[r-1][j+1].equals(STR)){
                    sol[r][j] *= 2;
                }
            }
            r++;
        }

        int t = 0;
        while(t < NoOfRws){
            for(int j = 0; j < NoOfClmns; j++){
                if(puzzleArray[t][j].equals(STR)){
                    sol[t][j] = -1;
                }
            }
            t++;
        }

        return sol;
    }

    public static void main(String[] args) {
        Minesweeper s = new Minesweeper();
        String[][] minesweeper = new String[4][4];
        for(int i = 0; i < minesweeper.length; i++){
            for(int j = 0; j < minesweeper[0].length; j++){
                minesweeper[i][j] = ".";
            }
        }
        minesweeper[0][1] = "m";
        minesweeper[2][3] = "m";
        minesweeper[3][0] = "m";
        int[][] ints = solveMinesweeper(minesweeper);

        System.out.println(Arrays.deepToString(ints).replace("], ", "]\n").replace("[[", "[").replace("]]", "]"));

    }

}
