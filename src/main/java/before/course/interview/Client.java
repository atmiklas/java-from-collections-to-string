package before.course.interview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by amik on 11/22/17.
 */
public class Client {

    public Map<Size, List<Package>> getMapImperative(List<Package> packages) {
        Map<Size, List<Package>> map = new HashMap<>();

        for(Package myPackage : packages) {
            if (map.get(myPackage.getPackageSize()) == null) {
                map.put(myPackage.getPackageSize(), new ArrayList<>());
            }
            map.get(myPackage.getPackageSize()).add(myPackage);
        }

        return map;
    }



    public Map<Size, List<Package>> getMap(List<Package> packages) {
        Map<Size, List<Package>> map = new HashMap<>();

        packages.stream().parallel().forEach((p) -> {
            if (null == map.get(p.getPackageSize())) {
                map.put(p.getPackageSize(), new ArrayList<>());
            }
            map.get(p.getPackageSize()).add(p);

        });

        return map;
    }
}
