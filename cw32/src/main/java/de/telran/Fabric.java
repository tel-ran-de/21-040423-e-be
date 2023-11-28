package de.telran;

import java.util.HashMap;
import java.util.Map;

public class Fabric {
    private Map<HashType, Hashable> type2Impl;

    public Fabric() {
        this.type2Impl = new HashMap<>();
        type2Impl.put(HashType.MD5, new Hasher());
        type2Impl.put(HashType.BASE_64, new Base64Hasher());
        type2Impl.put(HashType.MD_WITH_SALT, new SmartHasher("test"));
    }

    public Hashable create(HashType type) {
        return type2Impl.get(type);
//        if (type == HashType.MD5) {
//            return new Hasher();
//        } else if (type == HashType.BASE_64) {
//            return new Base64Hasher();
//        } else if (type == HashType.MD_WITH_SALT) {
//            return new SmartHasher("test");
//        }
    }
}
