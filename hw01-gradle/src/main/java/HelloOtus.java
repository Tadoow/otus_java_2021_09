import com.google.common.base.Joiner;
import com.google.common.collect.Lists;

import java.util.List;

public class HelloOtus {
    public static void main(String[] args) {
        List<String> names = Lists.newArrayList("Blue", "Yellow", "Green", "Red");
        String result = Joiner.on(", ").join(names);

        System.out.println(result);
    }
}
