package models;

import java.util.ArrayList;

/**
 * Created by jmarquez on 11/3/2014.
 */
public class SubscriptionUserModel extends RegisteredUserModel {

    ArrayList<ItemModel> _shoppingListByItem;
    ArrayList<UserModel> _shoppingListByUser;
    private int _subscriptionId;

    public SubscriptionUserModel(int userId, String createDate, String firstName, String lastName, boolean isAdmin, Enums.UserType userType, int accountId,
                                 String address, String phoneNumber, String dateOfBirth, String gender, String email, int subscriptionId, int securityQuestionId, String securityAnswer)
    {
        super.setUserId(userId);
        super.setCreateDate(createDate);
        super.setFirstName(firstName);
        super.setLastName(lastName);
        super.setIsAdmin(isAdmin);
        super.setUserType(userType);
        super.setAccountId(accountId);
        super.setAddress(address);
        super.setPhoneNumber(phoneNumber);
        super.setDateOfBirth(dateOfBirth);
        super.setGender(gender);
        super.setEmail(email);
        super.setSecurityQuestionId(securityQuestionId);
        super.setSecurityAnswer(securityAnswer);
        _subscriptionId = subscriptionId;
    }

    public SubscriptionUserModel()
    {
        //
    }

    public ArrayList<ItemModel> getShoppingListByItem()
    {
        return _shoppingListByItem;
    }

    public ArrayList<UserModel> getShoppingListByUser() { return _shoppingListByUser; }

    public void setShoppingListByUser(ArrayList<UserModel> shoppingList)
    {
        _shoppingListByUser = shoppingList;
    }

    public void setShoppingListByItem(ArrayList<ItemModel> shoppingList)
    {
        _shoppingListByItem = shoppingList;
    }

    public int getSubscriptionId()
    {
        return _subscriptionId;
    }

    public void setSubscriptionId(int subscriptionId)
    {
        _subscriptionId = subscriptionId;
    }

    public void setSubscriptionUserType()
    {
        super.setUserType(Enums.UserType.SUBSCRIPTION);
    }
}
