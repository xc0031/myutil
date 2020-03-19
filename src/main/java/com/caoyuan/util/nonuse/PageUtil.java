package com.caoyuan.util.nonuse;

//import java.util.List;
//
//import org.springframework.ui.Model;
//
//import com.github.pagehelper.Page;
//import com.github.pagehelper.PageInfo;

/*********************************************************
@作者:曹原
@日期:2019年11月9日
@时间:上午11:04:44
分页工具类,前端框架有更好的分页工具,pagehelper不再使用,减少jar包导入
*********************************************************/
public class PageUtil {
	///**
	// * 	普通button标签,适用于无form标签的地方,如需要form,只需后边拼接上$("form").serialize();
	// * 	存入值:
	// * 		String pageStr
	// * 		PageInfo page
	// *
	// * 	需要创建limit(pageNum)方法
	//  	function limit(pageNum) {
	//		location="list?pageNum="+pageNum;
	//	}
	//	function limit(pageNum) {
	//		location="list?pageNum="+pageNum+"&"+$("form").serialize();
	//	}
	// */
	//public static <T> void getPageButton(Model model, PageInfo<T> page) {
	//	String pageStr = "<input type='button' class=\"btn btn-info btn-sm\" onclick='limit(1)' value='首页'>&emsp;";
	//	pageStr += "<input type='button' class=\"btn btn-info btn-sm\" onclick='limit("
	//			+ (page.getPrePage() == 0 ? 1 : page.getPrePage())
	//			+ ")' value='上一页'>&emsp;";
	//	pageStr += "第" + page.getPageNum() + "/" + page.getPages() + "页,共"
	//			+ page.getTotal() + "条数据&emsp;";
	//	pageStr += "<input type='button' class=\"btn btn-info btn-sm\" onclick='limit("
	//			+ (page.getNextPage() == 0 ? page.getPages() : page.getNextPage())
	//			+ ")' value='下一页 '>&emsp;";
	//	pageStr += "<input type='button' class=\"btn btn-info btn-sm\" onclick='limit("
	//			+ page.getPages() + ")' value='尾页'>";
	//	model.addAttribute("pageStr", pageStr);
	//	model.addAttribute("page", page);
	//}
	//
	//public static <T> void getPageButton(Model model, List<T> list, Integer pageNum,
	//		Integer pageSize, Long total) {
	//	Page<T> ps = new Page<T>(pageNum, pageSize);
	//	ps.setTotal(total);
	//	PageInfo<T> page = new PageInfo<T>(ps);
	//	getPageButton(model, page);
	//}
	//
	///**
	// * 	具有Submit功能的按钮,适用于form标签里
	// * 	存入值:
	// * 		String pageStr
	// * 		PageInfo page
	// * @param <T>
	// */
	//public static <T> void getPageSubmit(Model model, PageInfo<T> page) {
	//	String pageStr = "<button name='pageNum' class=\"btn btn-info btn-sm\" value='1'>首页</button>&emsp;";
	//	pageStr += "<button name='pageNum' class=\"btn btn-info btn-sm\" value='"
	//			+ (page.getPrePage() == 0 ? 1 : page.getPrePage())
	//			+ "'>上一页</button>&emsp;";
	//	pageStr += "第" + page.getPageNum() + "/" + page.getPages() + "页,共"
	//			+ page.getTotal() + "条数据&emsp;";
	//	pageStr += "<button name='pageNum' class=\"btn btn-info btn-sm\" value='"
	//			+ (page.getNextPage() == 0 ? page.getPages() : page.getNextPage())
	//			+ "'>下一页</button>&emsp;";
	//	pageStr += "<button name='pageNum' class=\"btn btn-info btn-sm\" value='"
	//			+ page.getPages() + "'>尾页</button>";
	//	model.addAttribute("pageStr", pageStr);
	//	model.addAttribute("page", page);
	//}
	//
	//public static <T> void getPageSubmit(Model model, List<T> list, Integer pageNum,
	//		Integer pageSize, Long total) {
	//	Page<T> ps = new Page<T>(pageNum, pageSize);
	//	ps.setTotal(total);
	//	PageInfo<T> page = new PageInfo<T>(ps);
	//	getPageSubmit(model, page);
	//}
	//
	///**
	// * 	bootstarp样式的分页,需要传入pageinfo
	// * 	如果pageinfo无分页信息,需要手动创建 page对象
	// * @param <T>
	// * @Title: getPageStr
	// * @param page
	// * @return
	// * @return: String
	// */
	//public static <T> String getPageStr(PageInfo<T> page) {
	//	String str = "<div class='container'>"
	//			+ "<ul class='pagination justify-content-center'>"
	//			+ "<li class='page-item'>"
	//			+ "<a class='page-link' href='javascript:goPage("
	//			+ (page.getPageNum() == 1 ? 1 : page.getPrePage()) + ");'>上一页</a>"
	//			+ "</li> ";
	//	for (int i : page.getNavigatepageNums()) {
	//		str += "<li class='page-item " + (page.getPageNum() == i ? "active" : "")
	//				+ " }'>" + "<a class='page-link' href='javascript:goPage(" + i
	//				+ ");'>" + i + "</a></li>";
	//	}
	//	str += "<li class='page-item'><a class='page-link' href='javascript:goPage("
	//			+ (page.getPageNum() == page.getPages() ? page.getPages()
	//					: page.getNextPage())
	//			+ ");'>下一页</a></li></ul><p align='center' class='small text-secondary'>共"
	//			+ page.getTotal() + "条数据," + page.getPageNum() + "/" + page.getPages()
	//			+ "/页</p></div>";
	//	return str;
	//}
}

/**
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 **/
