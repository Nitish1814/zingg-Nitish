package zingg.spark.core.hash;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.spark.sql.types.DataTypes;

import zingg.common.core.hash.TrimLastDigitsFloat;

/**
 * Spark specific trim function for Float
 * 
 *
 */
public class SparkTrimLastDigitsFloat extends SparkHashFunction<Float, Float>{
	
	private static final long serialVersionUID = 1L;
	public static final Log LOG = LogFactory.getLog(SparkTrimLastDigitsFloat.class);
 
	public SparkTrimLastDigitsFloat(int count){
	    setBaseHash(new TrimLastDigitsFloat(count));
        setDataType(DataTypes.FloatType);
        setReturnType(DataTypes.FloatType);
	}
    
}
