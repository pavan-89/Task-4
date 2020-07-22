public class Operations {
    public String compute(float[] arr) {
        String res="";
        int ch=(int)arr[2];
        switch(ch) {
            case 1:
                res=add(arr[0],arr[1]);
                break;
            case 2:
                res=sub(arr[0],arr[1]);
                break;
            case 3:
                res=mul(arr[0],arr[1]);
                break;
            case 4:
                res=div(arr[0],arr[1]);
                break;
            default:
                res="Invalid operation selected!";
        }
        return res;
    }

    public String add(float a,float b) {
        return "Result="+String.valueOf(a+b);
    }

    public String sub(float a,float b) {
        return "Result="+String.valueOf(a-b);
    }

    public String mul(float a,float b) {
        return "Result="+String.valueOf(a*b);
    }

    public String div(float a,float b) {
        if(b==0)
            return "Division by zero not possible";
        return "Result="+String.valueOf(a/b);
    }
}