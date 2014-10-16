package model.QueryBuild;

/**
 * Created by jesperbruun on 15/10/14.
 */
public class QueryBuilder {

    private String selectValue;
    private String tableName;
    private String fields;
    private boolean softDelete = false;



    protected void setSelectValue(String selectValue) {
        this.selectValue = selectValue;
    }
    protected String getSelectValue(){
        return selectValue;
    }

    protected String getTableName() {
        return tableName;
    }
    protected void setTableName(String tableName) {
        this.tableName = tableName;
    }

    protected String getFields(){
        return fields;
    }
    protected void setFields(String fields){
        this.fields = fields;
    }

    /**
     * SELECT values FROM tablename
     * @param values
     * @param tableName
     * @return
     */
    public Where selectFrom(String[] values, String tableName) {

        QueryBuilder queryBuilder = new QueryBuilder();

        StringBuilder sb = new StringBuilder();
        for (String n : values) {
            if (sb.length() > 0) sb.append(',');
            sb.append(n);
        }
        queryBuilder.setSelectValue(sb.toString());
        queryBuilder.setTableName(tableName);

        return new Where(queryBuilder);
    }

    /**
     * SELECT * FROM tablename
     * @param tableName
     * @return
     */
    public Where selectFrom(String tableName) {

        QueryBuilder queryBuilder = new QueryBuilder();

        queryBuilder.setSelectValue("*");
        queryBuilder.setTableName(tableName);
        return new Where(queryBuilder);
    }

    /**
     * INSERT INTO tablename (Fields)
     * @param tableName
     * @param fields
     * @return
     */
    public Values insertInto(String tableName, String[] fields){

        QueryBuilder queryBuilder = new QueryBuilder();
        queryBuilder.setTableName(tableName);

        StringBuilder sb = new StringBuilder();
        for (String n : fields) {
            if (sb.length() > 0) sb.append(',');
            sb.append(n);
        }
        queryBuilder.setFields(sb.toString());
        return new Values(queryBuilder);

    }

    public Where deleteFrom(String tablename){
        QueryBuilder queryBuilder = new QueryBuilder();
        queryBuilder.setTableName(tableName);
        return new Where(queryBuilder);
    }

}





