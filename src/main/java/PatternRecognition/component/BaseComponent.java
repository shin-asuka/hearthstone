package PatternRecognition.component;

import java.awt.geom.Point2D;
import java.util.List;
import java.util.Map;

/**
 * Created by yang.chao on 2017/10/10.
 */
public abstract class BaseComponent {

    private Map<String,Object> feature;
    private List<Point2D> feasibleRegion;

    public Map<String, Object> getFeature() {
        return feature;
    }

    public void setFeature(Map<String, Object> feature) {
        this.feature = feature;
    }

    public List<Point2D> getFeasibleRegion() {
        return feasibleRegion;
    }

    public void setFeasibleRegion(List<Point2D> feasibleRegion) {
        this.feasibleRegion = feasibleRegion;
    }

}
