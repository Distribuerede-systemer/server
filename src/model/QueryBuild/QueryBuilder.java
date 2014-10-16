package model.QueryBuild;

/**
 * Created by jesperbruun on 15/10/14.
 */
public class QueryBuilder {

    private String selectValue;
    private String tableName;
    private String fields;
    private boolean softDelete;
    private boolean isUpdate;

    protected void setSoftDelete(boolean b){
        this.softDelete = b;
    }
    protected boolean isSoftDelete(){
        return softDelete;
    }

    protected boolean isUpdate() {
        return isUpdate;
    }
    protected void setUpdate(boolean isUpdate) {
        this.isUpdate = isUpdate;
    }

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
     * @param values String[]
     * @param tableName String
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
     * SELECT * FROM tableName
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
     * INSERT INTO tableName fields
     * @param tableName
     * @param fields
     * @return
     */
    public Values insertInto(String tableName, String[] fields){

        QueryBuilder queryBuilder = new QueryBuilder();
        queryBuilder.setTableName(tableName);

        StringBuilder sb = new StringBuilder();
        for (String n : fields) {
            if (sb.length() > 0) {
                sb.append(',');
            }
            sb.append(n);
        }
        queryBuilder.setFields(sb.toString());
        return new Values(queryBuilder);

    }

    /**
     * UPDATE tableName SET ([fields,values], [fields, value] ...)
     * @param tableName
     * @param fields
     * @param values
     * @return
     */
    public Where update(String tableName, String[] fields, String[] values) {
        QueryBuilder queryBuilder = new QueryBuilder();
        queryBuilder.setTableName(tableName);

        String setQuery = "";
        for (int i = 0; i < fields.length; i++) {
            if(i != (fields.length-1)) {
                setQuery += fields[i] + "='" + values[i] + "',";
            } else {
                setQuery += fields[i] + "='" + values[i] + "'";
            }
        }
        queryBuilder.setFields(setQuery);
        queryBuilder.setUpdate(true);

        return new Where(queryBuilder);
    }

    /**
     * Soft delete method. UPDATE tableName
     * @param tableName
     * @return
     */
    public Where deleteFrom(String tableName){
        QueryBuilder queryBuilder = new QueryBuilder();
        queryBuilder.setTableName(tableName);
        queryBuilder.setSoftDelete(true);
        return new Where(queryBuilder);
    }




}





