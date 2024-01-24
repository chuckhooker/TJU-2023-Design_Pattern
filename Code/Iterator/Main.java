package Iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		PageShelf pageShelf = new PageShelf(100);

		// the data number of one page can contain 
        int pageSize = 3; 
        int pageNum = 1;
        
        // the original data
        String[] originalArray = {"a", "b", "c", "d", "e", "f", "g", "h"}; 

        // split the origin data into size of pages
        List<String[]> splitArrays = splitArray(originalArray, pageSize);

        for (String[] arr : splitArrays) {
        	pageShelf.appendPage(new Page(pageNum, arr));
        	pageNum++;
        }
		
		Iterator it = pageShelf.iterator();
		while (it.hasNext()) {
			Page page = (Page)it.next();
			System.out.println(page.getNumber());
			page.getData();
		}
		
	}
	
	public static List<String[]> splitArray(String[] originalArray, int pageSize) {
        List<String[]> result = new ArrayList<>();
        int length = originalArray.length;
        
        for (int i = 0; i < length; i += pageSize) {
            int end = Math.min(i + pageSize, length); 
            String[] subArray = Arrays.copyOfRange(originalArray, i, end);
            result.add(subArray);
        }
        
        return result;
    }
}
