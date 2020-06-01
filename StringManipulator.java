class StringManipulator{
    public String trimAndConcat(String s1, String s2){
        String temp1 = s1.trim();
        String temp2 = s2.trim();
        return temp1+temp2;
    }

    public Integer getIndexOrNull(String input, char toFind){
        int index = input.indexOf(toFind);
        if(index == -1) return null;
        else return index;
    }

    public Integer getIndexOrNull(String input, String toFind){
        int index = input.indexOf(toFind);
        if(index == -1) return null;
        else return index;
    }

    public String concatSubstring(String input, int start, int end, String addTo){
        String subString = input.substring(start, end);
        return subString + addTo;
    }
}