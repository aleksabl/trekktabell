package ske.fastsetting.skatt.trekktabell2016;

import java.util.Map;

public class HeleTabellen {
    public final Map<Long, Long> alleTrekk;
    public final int overskytendeProsent;

    public HeleTabellen(Map<Long, Long> alleTrekk, int overskytendeProsent) {
        this.alleTrekk = alleTrekk;
        this.overskytendeProsent = overskytendeProsent;
    }

}
