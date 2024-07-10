package zingg.spark.core.executor;

import java.util.HashMap;

import zingg.common.client.IZingg;
import zingg.common.client.IZinggFactory;
import zingg.common.client.options.ZinggOption;
import zingg.common.client.options.ZinggOptions;
import zingg.spark.core.export.SparkModelExporter;

public class SparkZFactory implements IZinggFactory{

    public SparkZFactory() {}

    public static HashMap<ZinggOption, String> zinggers = new  HashMap<ZinggOption, String>();

    static {
        zinggers.put(ZinggOptions.TRAIN, SparkTrainer.name);
        zinggers.put(ZinggOptions.FIND_TRAINING_DATA, SparkTrainingDataFinder.name);
        zinggers.put(ZinggOptions.LABEL, SparkLabeller.name);
        zinggers.put(ZinggOptions.MATCH, SparkMatcher.name);
        zinggers.put(ZinggOptions.TRAIN_MATCH, SparkTrainMatcher.name);
        zinggers.put(ZinggOptions.LINK, SparkLinker.name);
        zinggers.put(ZinggOptions.GENERATE_DOCS, SparkDocumenter.name);
        zinggers.put(ZinggOptions.UPDATE_LABEL, SparkLabelUpdater.name);
        zinggers.put(ZinggOptions.FIND_AND_LABEL, SparkFindAndLabeller.name);
        zinggers.put(ZinggOptions.RECOMMEND, SparkRecommender.name);
        zinggers.put(ZinggOptions.PEEK_MODEL, SparkPeekModel.name);
        zinggers.put(ZinggOptions.EXPORT_MODEL, SparkModelExporter.name);
    }

    public IZingg get(ZinggOption z) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return (IZingg) Class.forName(zinggers.get(z)).newInstance();
    }

   
    
}
