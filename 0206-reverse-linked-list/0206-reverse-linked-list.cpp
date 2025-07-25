/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* reverseList(ListNode* head) {
        vector<int> ans;
        ListNode *temp=head; //a creating tempory node to point the nodes

        while(temp!=NULL){ //reus till temp reach NUll
            ans.push_back(temp->val);
            temp=temp->next;
        }
        int i= ans.size()-1;
        temp=head;

        while(temp){
            temp->val=ans[i]; 
            i--;
            temp=temp->next;

        }
        return head;
        
    }
};