package model.QueryBuild;

/**
 * Created by jesperbruun on 16/10/14.
 */
public class Values {

    private QueryBuilder queryBuilder;
    private String[] values;

    private void setValues(String[] values){
        this.values = values;
    }
    protected String[] getValues(){
        return values;
    }

    protected QueryBuilder getQueryBuilder(){
        return this.queryBuilder;
    }

    public Values(QueryBuilder queryBuilder){
        this.queryBuilder = queryBuilder;
    }
    private Values(){

    }

    public Execute values(String[] values){
        Values v = new Values();
        v.setValues(values);
        return new Execute(getQueryBuilder(), v);
    }

}
