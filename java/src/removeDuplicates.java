
public class removeDuplicates {
	//removing duplicates in an array via using Regex

    int length = nums.length;

    System.out.println(nums);
    String removedDuplicate = Arrays.toString(nums);
    removedDuplicate = removedDuplicate.replaceAll("(.)(?=(.*))(?<=(?=\\1.*?\\1\\2$).+)","");
    String[] items = removedDuplicate.replaceAll("\\[", "").replaceAll("\\]", "").replaceAll("\\s", "").split(",");
    System.out.println(Arrays.toString(items));
    int[] results = new int[items.length];

    for (int i = 0; i < items.length; i++) {
        try {
            results[i] = Integer.parseInt(items[i]);
        } catch (NumberFormatException nfe) {

        };
    }
    System.out.println(results.length);
    return results.length;
}
