package ru.netology.domain;

public class NetologyPost {

    public class WelomeLogo {
        private String imageUrl;
        private String text;
    }

    public class SubscribersInfo {
        private int subscriberId;
        private String subsciberImageUrl;
        private int countSubscribers;
        private boolean userIsSubscribded;
        private String viewAllSubscribe;
    }

    public class InformationAboutUs {
        private String imageUrl;
        private String text;
        private String adressUrl;
        private String locationUrl;
    }
    public class Market {
        private String imageUrl;
        private String text;
        private String coast;
        private String viewAllProduct;
    }

    public class Article{
        private String imageUrl;
        private String text;
    }

    public class PostsInfo{
        private String imageUrl;
        private String text;
        private String dataOfWriting;
        private int likesCount;
        private boolean userIsLike;
        private int repostCount;
        private int commentsCount;
        private int viewCount;
        private boolean takeToFavorites;
    }

    public class CommentsInfo{
        private String userId;
        private String dataOfWriting;
        private String userImageUrl;
        private String text;
    }
}
