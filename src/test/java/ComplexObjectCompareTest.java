import static org.craftedsw.beanpropertymatcher.matcher.BeanMatcher.has;
import static org.craftedsw.beanpropertymatcher.matcher.BeanPropertyMatcher.property;
import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.CoreMatchers.is;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

import com.mageddo.test.hamcrest.test.bean.Fruit;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author elvis
 * @version $Revision: $<br/>
 *          $Id: $
 * @since 5/25/16 4:35 PM
 */
public class ComplexObjectCompareTest {


    @Test
    public void CompareDiferentObjectTypesWithSamePropertiesInSameList(){

        final Fruit fruit = new Fruit();
        fruit.setColor("green");
        fruit.setName("coco");

        final Map<String, Object> fruitMap = new LinkedHashMap<>();
        fruitMap.put("color", "green");
        fruitMap.put("name", "coco");

        Assert.assertThat(Arrays.asList(fruit), hasItem(
                has(
                        property("name", is("coco")),
                        property("color", is("green"))
                )
        )
        );

    }

    @Test
    public void CompareDiferentObjectTypesWithSameProperties(){

        final Fruit fruit = new Fruit();
        fruit.setColor("green");
        fruit.setName("coco");

        final Map<String, Object> fruitMap = new LinkedHashMap<>();
        fruitMap.put("color", "green");
        fruitMap.put("name", "coco");


        Assert.assertThat(Arrays.asList(fruit), hasItem(
                has(
                        property("name", is("coco")),
                        property("color", is("green"))
                )
            )
        );

    }

}
