package model.QueryBuild;

/**
 * Created by jesperbruun on 15/10/14.
 */
public class QueryBuilder {

    private String selectValue;
    private String tableName;

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

    public Where selectFrom(String tableName) {

        QueryBuilder queryBuilder = new QueryBuilder();

        queryBuilder.setSelectValue("*");
        queryBuilder.setTableName(tableName);
        return new Where(queryBuilder);
    }

//Not ready yet


    public Values insertInto(String tableName){

        QueryBuilder queryBuilder = new QueryBuilder();
        queryBuilder.setTableName(tableName);
        return new Values(queryBuilder);

    }





}





