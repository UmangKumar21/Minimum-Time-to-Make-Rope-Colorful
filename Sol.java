class Sol{
    public int minimumCost(String color, int[] needTime) {
        int tt=0;
        int i=0,j=0;
        while(i<needTime.length && j<needTime.length){
            int ct=0,cm=0;
            while(j<needTime.length && color.charAt(i)==color.charAt(j)){
                ct=ct+needTime[j];
                cm=Math.max(cm,needTime[j]);
                j++;
            }
            tt=tt+ct-cm;
            i=j;
        }
        return tt;
        
    }
}
