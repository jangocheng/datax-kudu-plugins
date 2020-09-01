package com.q1.datax.plugin.writer.kudu11xwriter;

/**
 * @author daizihao
 * @create 2020-08-31 14:17
 **/
public class Key {
    public final static String KUDU_CONFIG = "kuduConfig";

    public final static String TABLE = "table";
    public final static String PARTITION = "partition";
    public final static String COLUMN = "column";

    public static final String NAME = "name";
    public static final String TYPE = "type";
    public static final String INDEX = "index";
    public static final String PRIMARYKEY = "primaryKey";
    public static final String COMPRESSION = "compression";
    public static final String COMMENT = "comment";
    public final static String ENCODING = "encoding";



    public static final String NUM_REPLICAS = "numReplicas";
    public static final String HASH = "hash";
    public static final String HASH_NUM = "num";

    public static final String RANGE = "range";
    public static final String LOWER = "lower";
    public static final String UPPER = "upper";



    public static  final String TRUNCATE = "truncate";

    public static final String INSERT_MODE = "insertMode";

    public static  final String WRITE_BATCH_SIZE = "writeBatchSize";

    public static  final String MUTATION_BUFFER_SPACE = "mutationBufferSpace";
}