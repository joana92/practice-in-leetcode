## This file includes note for questions of array tags

### 61 Pascal's Triangle
* Initial two dimention arraylist
 List<List<Integer>> list = new ArrayList<List<Integer>>();
Or,
import static java.util.Arrays.*;

List<List<Integer>> list = asList(
    asList( 1, 2, 3 ),
    asList( 4, 5, 6 ),
    asList( 6, 7, 8 ) );
