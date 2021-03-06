package controllers;

import DataAccess.DiscountService;
import DataAccess.ItemService;
import businessLogic.ShoppingCartManager;
import models.DiscountModel;
import models.Enums;
import models.ItemModel;
import models.ShoppingCartModel;

/**
 * Created by jmarquez on 10/23/2014.
 */
public class ShoppingCartController {

    private static ShoppingCartManager _shoppingCartManager = new ShoppingCartManager();
    private static ItemService _itemService = new ItemService();
    private static DiscountService _discountService = new DiscountService();

    public static void addItemToCart(ShoppingCartModel shoppingCart, int itemId)
    {   //todo get item from shopping cart
        ItemModel itemModel = new ItemModel(itemId,"Name",0.00,5,"Description", Enums.Category.Bread,-1, null); //todo needs to be a call to get an Item
                 _shoppingCartManager.addItemToCart(shoppingCart, itemModel);
    }

    public static void deleteItemFromCart(ShoppingCartModel shoppingCart, int itemId)
    {   //todo get item from shopping cart
        ItemModel itemModel = new ItemModel(itemId,"Name",0.00,5,"Description", Enums.Category.Bread,-1, null); //todo needs to be a call to get an Item
        _shoppingCartManager.deleteItemFromCart(shoppingCart, itemModel);
    }

    public static boolean applyDiscount(ShoppingCartModel shoppingCart, String discountCode)
    {   DiscountModel discountModel = new DiscountModel(); //todo needs to be a call to get a Discount
        if(discountModel != null)
        {
            return _shoppingCartManager.applyDiscount(shoppingCart, discountModel);
        }
        return false;
    }
}
