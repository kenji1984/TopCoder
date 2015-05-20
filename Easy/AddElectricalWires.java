public class AddElectricalWires{
    public static int maxNewWires(String[] wires, int[] gridConnections){
        int gridLength = gridConnections.length;
        
        //get the max number of safe nodes
        int max_conns = wires.length - gridLength;
        if(max_conns == 0) return 0;
        
        /*Check all the nodes connected to the grid to see if any of them is connected to the 
        free nodes. If it is, that means free nodes cannot be connected anymore.
        */
        for(int i = 0; i < gridLength; i++){
            int count = 0;
            for(int j = 0; j < wires.length; j++){
                if(wires[gridConnections[i]].charAt(j) == '1') ++count;
            }
            
            if(count > 0) --max_conns;
        }
        return summation(max_conns);
    }

    //given a number of nodes. return the max number of connections
    public static int summation(int n){
        if (n == 0) return 0;
        if(n == 1) return 1;
        return n + summation(n - 1);
    }
}