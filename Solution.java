import java.util.*;

public class Solution {
    public int solution(int[] nums) {
    
        Set<Integer> ponketmon = new HashSet<>(); //포켓몬 종류를 저장할 Hashset (중복제거)
        
        for (int num : nums) {  
            ponketmon.add(num);
        } //set에 포켓몬을 지어넣음
    
        int maxPick = nums.length / 2; //변수 maxPick에 가질수 있는 포켓몬 최대수 연산 결과를 저장
        

        return Math.min(ponketmon.size(), maxPick); //최대로 고를 수 있는 종류 수 계산
    }
}