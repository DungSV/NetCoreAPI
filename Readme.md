🔥🔥🔥 Tạo hoặc Mở Project <br>
🔹 Cách 1: Tạo mới một Project <br>
Mở VS Code.<br>
Chọn File → Open Folder… (hoặc nhấn Ctrl + K + O).<br>
Chọn thư mục muốn làm project hoặc tạo thư mục mới.<br>
Bấm Select Folder.<br>

🔹 Cách 2: Clone một Project từ GitHub<br>
Mở VS Code.<br>
Chọn View → Command Palette… (hoặc Ctrl + Shift + P).<br>
Gõ "Git: Clone" → Nhập URL repo GitHub.<br>
Chọn thư mục lưu trữ project.<br>

1️⃣ Kiểm tra số lượng commit trong lịch sử:
git log --oneline<br>
2️⃣ Reset lại về commit đầu tiên nhưng vẫn giữ code:
git reset --soft $(git rev-list --max-parents=0 HEAD)<br>
3️⃣ Tạo commit mới để thay thế toàn bộ lịch sử:
git commit -m "Giữ lại chỉ commit cuối cùng"<br>
4️⃣ Push lại nhánh lên GitHub/GitLab (nếu cần):
git push origin main --force<br>


🔥🔥🔥 https://github.com/phamquanghien/JavaOOP <br>
Hiển thị tất cả các nhánh: git branch -a <br>
Tạo nhánh mới: git checkout -b BRANCH_NAME, git push -u origin BRANCH_NAME<br>
Cập nhật thay đổi mã nguồn lên github: git add ., git commit -m COMMIT_NOTE, git push<br>
Đồng bộ mã nguồn từ nhánh "Test" vào nhánh "main": cần chuyển sang nhánh "main" và chạy lệnh "git merge Test"<br>
Hiển thị danh sách các commit: git log --oneline<br>
Khôi phục mã nguồn tại thời điểm bất kỳ (không giữ lại các thay đổi): git reset --hard COMMIT_ID<br>
Khôi phục mã nguồn tại thời điểm bất kỳ (giữ lại các thay đổi): git reset --soft HEAD~SoLuongCommit<br>
Xoá nhánh trên local: git branch -d BRANCH_NAME<br>
Xoá nhánh trên remote (github): git push origin --delete BRANCH_NAME<br>