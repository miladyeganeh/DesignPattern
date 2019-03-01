package factory;

class Factory {
    static Reader getReader(String fileType) throws Exception {
        if ("xml".equalsIgnoreCase(fileType)){
            return new XMLReader();
        }else if ("json".equalsIgnoreCase(fileType))
            return new JSONReader();
        throw new Exception("Invalid Type!");
    }
}
