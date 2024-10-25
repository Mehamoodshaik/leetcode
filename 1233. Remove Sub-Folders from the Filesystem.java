class Solution {
    public List<String> removeSubfolders(String[] folder) {
        Set<String> fldSet = new HashSet<>(Arrays.asList(folder));
        List<String> res = new ArrayList<>();
        for(String fld:folder){
            String prefix = fld;
            boolean isSubF = false;
            
            while(!prefix.isEmpty()){
                int pos = prefix.lastIndexOf('/');
                if(pos==-1){
                    break;
                }
                prefix = fld.substring(0,pos);
                if(fldSet.contains(prefix)){
                    isSubF= true;
                    break;
                }
            }
            if(!isSubF){
                res.add(fld);
            }
        }
        return res;
    }
}
