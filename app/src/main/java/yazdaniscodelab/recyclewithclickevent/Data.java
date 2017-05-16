package yazdaniscodelab.recyclewithclickevent;

/**
 * Created by Yazdani on 5/16/2017.
 */

public class Data {


    public Data(int image_res,String title,String description,String author,String price,String card){

        setImage_res(image_res);
        setTitle(title);
        setDescription(description);
        setAuthor(author);
        setPrice(price);
        setCard(card);

    }



    int image_res;
    String title;
    String description;
    String author;
    String price;
    String card;

    public int getImage_res(){
        return image_res;
    }

    public void setImage_res(int image_res){
        this.image_res=image_res;
    }

    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title=title;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(String description){
        this.description=description;
    }

    public String getAuthor(){
        return author;
    }

    public void setAuthor(String author){
        this.author=author;
    }

    public String getPrice(){
        return price;
    }

    public void setPrice(String price){
        this.price=price;
    }

    public String getCard(){
        return card;
    }

    public void setCard(String card){
        this.card=card;
    }





}
