public class AccessChanger {
    public static String[] convert(String[] program) {
        int length = program.length;
        String[] newProg = new String[length];
        for(int i = 0; i < length; i++){
            int indexOfSlash = program[i].indexOf("//");
            if(indexOfSlash < 0) indexOfSlash = length;
            newProg[i] = program[i].substring(0, indexOfSlash).replace("->", ".")
                + program[i].substring(indexOfSlash);
        }
        return newProg;
    }
}
