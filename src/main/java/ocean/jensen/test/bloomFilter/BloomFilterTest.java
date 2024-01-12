package ocean.jensen.test.bloomFilter;

import com.google.common.base.Charsets;
import com.google.common.hash.BloomFilter;
import com.google.common.hash.Funnels;

/**
 * @author Jensen
 * @version 1.0
 * @date 2024/1/12 14:41
 * 布隆过滤器
 */
public class BloomFilterTest {
    public static void main(String[] args) {
        BloomFilter<String> filter = BloomFilter.create(
                Funnels.stringFunnel(Charsets.UTF_8),100
        );
        filter.put("test");
        System.out.println(filter.test("test"));
        System.out.println(filter.test("test1"));
    }
}
