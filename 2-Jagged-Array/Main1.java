class Main1{
    public static void main(String args[]){
        int[][] arr = new int[3][]; 
        // Jagged Array- Here we dont need to define no.of column
        // We can give different no. of column to each row
        arr[0] = new int[3];
        arr[1] = new int[4];
        arr[2] = new int[2];
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[i].length; j++){
                arr[i][j] = (int)(Math.random()*10);
            }
        }
        for(int i[]:arr){
            for(int j:i){
                System.out.print(j+" ");
            }
            System.out.println("");
        }
        
    }
}