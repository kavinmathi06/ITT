// You are using GCC
#include<iostream>
using namespace std;
struct Node{
    int data;
    Node* next;
};
class Stack{
    private:
        Node* top;
    public:
        Stack(){
            top=nullptr;
        }
        void push(int val){
            Node* newNode=new Node();
            newNode->data=val;
            newNode->next=top;
            top=newNode;
            cout<<val<<" is pushed onto the stack"<<endl;
        }
        void pop(){
            if(top==nullptr){
                cout<<"Stack underflow"<<endl;
                return;
            }
            Node* temp=top;
            cout<<temp->data<<" is popped from the stack"<<endl;
            top=top->next;
            delete temp;
        }
        void display(){
            if(top==nullptr){
                cout<<"Stack is empty"<<endl;
                return;
            }
            cout<<"Elements in the stack: ";
            Node* temp=top;
            while(temp!=nullptr){
                cout<<temp->data<<(temp->next!=nullptr?" ":"");
                temp=temp->next;
            }
            cout<<endl;
        }

};
int main(){
    Stack s;
    int choice,value;
    while(true){
        if(!(cin>>choice)) break;
        if(choice==1){
            if(cin>>value){
                s.push(value);
            }
        }
        else if(choice==2){
            s.pop();
        }
        else if(choice==3){
            s.display();
        }
        else if(choice==4){
            cout<<"Exiting the program"<<endl;
            break;
        }
        else{
            cout<<"Invalid choice"<<endl;
        }
    }
    return 0;
}