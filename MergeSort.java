public class MergeSort {

    int[]array;
    int[]tempMergeArr;
    int length;
    public static void main(String[] args) {
        int[] InputArr ={48,36,13,52,19,94,21};
        MergeSort ms=new MergeSort();
        ms.sort(InputArr);
        for(int i:InputArr)
        {
            System.out.print(i+" ");
        }
    }
    public void short(int InputArr[])
            this.array=inputArr;
    this.length=inputArr.length;
    this.tempMergeArr=new int[length];
    divideArray(0,length-1);
}
  public void divideArray(Int lowerIndex, Int higherIndex)
if(lowerIndex<higherIndex)
{
int middle=lowerIndex+(higherIndex-lowerIndex)/2;
//it will sort the left side of an array
divide Array(lowerIndex,middle);
//it will sort the right side of an array
divideArray(middle+1,higherIndex);
mergeArray(loweindex, middle,highrIndex);
}
public void mergeArray(Int lowerIndex, Int middle, Int higherIndex)
{
for(int I= lowerIndex; I<higherIndex; i++)
{
tempMergeArr[i]=array[i]
}
int i = lowerIndex;
int j = middle+1;
int k = lowerIndex;
while(I<middle && j<=higherIndex)
{
if(tempMergeArr[i]<=tempMergeArr[j])
{
array[k]=tempMergeArr[i];
i++;
}
else
{
array[k]=tempMergeArr[j];
j++;
}
k++;
}
while(i<=middle)
{
array[k]=tempMergeArr[i];
k++;
i++;
}
}
