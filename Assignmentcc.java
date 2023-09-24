import java.util.*;

public class Assignmentcc {

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(5);
        nums.add(62);
        nums.add(10);
        nums.add(51);
        System.out.println(nums.get(3));
        System.out.println(nums.indexOf(10));



        for(int i : nums) {
            System.out.println(i);
        }
        Set<Integer> nums1 = new HashSet<>();
        nums1.add(88);
        nums1.add(82);
        nums1.add(88);
        nums1.add(80);
        nums1.add(89);
        System.out.println(nums1);

        Map<String,String> map=new HashMap<>();
        map.put("Name","Rishitha");
        map.put("id","3");
        map.put("cg","wsu");
        map.put("city","st");

        for(Map.Entry<String,String> i:map.entrySet()) {
            System.out.println(i);
        }

    }

}
