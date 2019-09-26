public class 02_Permutation {
    int n;
    boolean[] st;   //是否占用
    List<List<Integer>> ans = new ArrayList<>();    //最终结果
    List<Integer> path = new ArrayList<>();     //当前结果
    List<Integer> temp;     //中间桥梁
    
    public List<List<Integer>> permute(int[] nums) {
        n = nums.length;
        st = new boolean[n];
        
        //深度搜索,枚举每个位置应该放什么数
        dfs(nums, 0); 
            
        //二维数组ans的每个索引存储的是一维数组的地址，而不是值，所以：
        //当已经把path存入到ans[0]时，然后你再修改path对象，那么你就是在修改ans[0]。
        return ans;
    }
    
    
    /**
     * u代表匹配到哪个位置了，从0位置开始匹配，0位置可以存储1 2 3nums数组的每个值
     */
    public void dfs(int[] nums, int u) {
        if(u == n) {
            //已经匹配完了数组的所有值，位置已经来到了n，需要把path对象加入到ans集合中,但是不能直接加，
            //因为Path变量是在一直变化的,使用temp对象接受path对象的值来构建一个新的对象，开辟新的内存
            temp = new ArrayList<>(path);
            ans.add(temp);
            return;
        }
        //for循环查看当前u位置可以存放什么数
        for(int i = 0; i < n; i++) {
            if(!st[i]) {
                //如果当前nums[i]还没有被path占用，那么现在就被占用了，并把该变量存入path中
                st[i] = true;
                path.add(nums[i]);
                
                //深度搜索u+1位置
                dfs(nums, u+1);
                
                //nums全部被占用的话，开始更改path变量
                path.remove(path.size()-1); 
                //修改为未被占用
                st[i] = false;
            }
        }
    }
}
