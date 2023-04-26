// Time Complexity: O(n)
// Space Complexity: O(n)
class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> lista = new ArrayList();
        for(int i = 1; i <= n;i++){
            if(i % 3 == 0 && i % 5 == 0){
                lista.add("FizzBuzz");
            }else if(i % 3 == 0){
                lista.add("Fizz");
            }else if(i % 5 == 0){
                lista.add("Buzz");
            }else{
                lista.add(String.valueOf(i));
            }
        }
        return lista;
    }
}